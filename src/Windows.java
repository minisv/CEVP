import DBM.DBMCheck;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;

public class Windows extends Frame {

    private CheckboxGroup programGroup;
    private CheckboxGroup fileTypeGroup;
    private File directory;
    private Button checkExistFilesButton;
    private TextArea fileArea;

    Windows() {
        setLayout(null);

        voicePackType();
        fileType();
        selectVoicePackFolder();
        checkExistFiles();
        textArea();

        setSize(600, 600);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dimension.width / 2 - this.getSize().width / 2,
                dimension.height / 2 - this.getSize().height / 2);
        setTitle("DBM / BigWigs 보이스 팩 누락 파일 검사 프로그램 - 미니룬 (디코: minirune)");
        setVisible(true);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    private void voicePackType() {
        Label voicePackTypeLabel = new Label("보이스 팩 타입을 골라주세요: ");
        voicePackTypeLabel.setBounds(20, 40, 380, 30);
        add(voicePackTypeLabel);

        programGroup = new CheckboxGroup();
        Checkbox dbm = new Checkbox("DBM", true, programGroup);
        Checkbox bigwigs = new Checkbox("BigWigs", false, programGroup);
        dbm.setBounds(440, 40, 80, 30);
        bigwigs.setBounds(520, 40, 80, 30);
        add(dbm);
        add(bigwigs);
        bigwigs.setEnabled(false);
    }

    private void fileType() {
        Label soundFileTypeLabel = new Label("녹음한 파일 타입을 골라주세요: ");
        soundFileTypeLabel.setBounds(20, 70, 380, 30);
        add(soundFileTypeLabel);

        fileTypeGroup = new CheckboxGroup();
        Checkbox ogg = new Checkbox("ogg", true, fileTypeGroup);
        Checkbox mp3 = new Checkbox("mp3", false, fileTypeGroup);
        ogg.setBounds(440, 70, 80, 30);
        mp3.setBounds(520, 70, 80, 30);
        add(ogg);
        add(mp3);
    }

    private void selectVoicePackFolder() {
        Button selectVoicePackFolderButton = new Button("보이스팩 폴더를 선택해주세요: ");
        selectVoicePackFolderButton.setBounds(20, 100, 560, 30);
        add(selectVoicePackFolderButton);
        selectVoicePackFolderButton.addActionListener(event -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser.showDialog(selectVoicePackFolderButton, null);
            directory = fileChooser.getSelectedFile();

            boolean enable = directory != null;
            checkExistFilesButton.setEnabled(enable);
        });
    }

    private void checkExistFiles() {
        checkExistFilesButton = new Button("파일 체크를 시작 합니다!");
        checkExistFilesButton.setBounds(20, 130, 560, 30);
        add(checkExistFilesButton);
        checkExistFilesButton.setEnabled(false);
        checkExistFilesButton.addActionListener(event -> {

            String program = programGroup.getSelectedCheckbox().getLabel();
            String fileType = fileTypeGroup.getSelectedCheckbox().getLabel();
            if (program.equals("DBM")) {
                fileArea.setText("");
                DBMCheck dbmCheck = new DBMCheck(directory, fileType);
                ArrayList<String> noExistFiles = dbmCheck.getNoExistFiles();
                noExistFiles.forEach(fileArea::append);
            }
        });
    }

    private void textArea() {
        fileArea = new TextArea();
        fileArea.setBounds(20, 160, 560, 420);
        add(fileArea);
    }

    private void showDialog(String message) {
        Dialog info = new Dialog(this, "안내", true);
        info.setSize(400, 100);
        info.setLocationRelativeTo(this);
        info.setLayout(new FlowLayout(FlowLayout.CENTER));

        Label label = new Label(message);
        info.add(label);

        Button close = new Button("확인");
        info.add(close);

        close.addActionListener(event -> info.dispose());
        info.setVisible(true);
    }
}
