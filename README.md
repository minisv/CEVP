# CEVP
Check Exist files your Voice Pack

### 개발 목적
[DBM](https://github.com/DeadlyBossMods/DeadlyBossMods) 또는 [BigWigs](https://github.com/BigWigsMods/BigWigs) 보이스 팩 음성을 녹음 해주시는 분들을 위하여 누락된 (업데이트된) 파일을 쉽게 찾기 위해 제작 되었습니다.

### 개발 상태
현재는 [DBM](https://github.com/DeadlyBossMods/DeadlyBossMods) 만 지원되고 있습니다. [BigWigs](https://github.com/BigWigsMods/BigWigs) 는 차후 지원 예정 입니다.

### 라이센스
- 이 프로젝트는 [World of Warcraft](https://worldofwarcraft.blizzard.com/)의 [DBM](https://github.com/DeadlyBossMods/DeadlyBossMods) 과 [BigWigs](https://github.com/BigWigsMods/BigWigs) 의 보이스 팩의 음성을 녹음 해주시는 분들을 위하여 만들어 졌습니다. 프로그램의 사용은 누구나 '무료' 로 할 수 있습니다.
- 이 프로젝트는 소스를 공개한 Open Project 입니다.
- 이 프로젝트는 [MIT License](https://raw.githubusercontent.com/minisv/CEVP/refs/heads/main/LICENSE) 를 따릅니다.

### How to Java install or uninstall
- [Amazon Corretto 17 for Mac](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/macos-install.html)
- 혹시나, 본인의 Mac 이 M1 이후 실리콘 맥 모델이라면 aarch64 로 받으셔야 합니다. 인텔맥 이라면 x64 로 받으세요. pkg 로 받아서 설치 하시면 됩니다.
- [Amazon Corretto 17 for Windows](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/windows-install.html)
- 
### Java 가 설치된 환경에서 CEVP.jar 로 실행하기
- Java 가 설치되지 않았다면, 윗단계를 먼저 해 주세요.
- [CEVP Jar 다운로드](https://github.com/minisv/CEVP/raw/refs/heads/main/download/CEVP.jar) 받기
- 이곳에서 받지 않은 파일은 '악성코드' 에 감염되어 있을 수 있으니 조심하여 주세요.
- java -jar CEVP.jar
- 위의 명령어를 입력하면 실행이 됩니다.
- 다만, java 환경설정이 되어 있어야 합니다.
- java 환경설정은 아래 도움말을 확인해 주세요.

### 사용방법
1. 보이스 팩 타입을 골라주세요.
2. 녹음한 파일 타입을 골라주세요. ogg 와 mp3 를 지원합니다.
3. 보이스팩 폴더를 선택해주세요. 버튼을 눌러 폴더를 지정해 주세요.
4. 파일 체크를 시작 합니다! 버튼을 누르면 파일 검사를 시작합니다.
- [DBM](https://github.com/DeadlyBossMods/DeadlyBossMods) 의 경우 [VoiceText](https://raw.githubusercontent.com/DeadlyBossMods/DBM-Voicepack-Demo/refs/heads/master/DBM-VPDemo/!VoiceText.txt) 파일을 가져와 데이터를 비교합니다.
- [BigWigs](https://github.com/BigWigsMods/BigWigs) 의 경우 [BigWigs_Voice/Tools](https://github.com/BigWigsMods/BigWigs_Voice/tree/master/Tools) 의 txt 파일들중 encode.txt 와 generate.txt 파일을 제외한 txt 파일들로 비교할 예정 입니다.

### 궁금한점은?
- 디스코드 minirune 으로 친구요청 하시고 문의 하여 주시기 바랍니다.
- 친구요청 하실때엔 방송채널 (치지직, 유튜브, 트위치 관계 없습니다.) 링크도 함께 보내주시면 더 좋겠습니다.

### 마무리 글
항상 [World of Warcraft](https://worldofwarcraft.blizzard.com/) 유저 분들을 위해 보이스 팩을 녹음 해주시는 분들의 노고에 감사 드립니다.