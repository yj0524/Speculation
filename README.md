# 부동산 투기 보드게임

### 실행 환경

* Java 16+
* paper 1.17.1

### 서버 열기

1. 소스코드 다운로드
2. cmd에 java -jar -Xmx[메모리 용량 (기가바이트)]G "./run/paper-1.17.1.jar" 입력
    * run 폴더 안에 있는 run-linux.sh 또는 run-windows.bat 파일을 실행시켜도 됩니다.
3. 서버 접속
4. 팀 선택 `/team join <team> <player>`
5. 게임 시작 `/speculation start <world> <players> <teamMatch>`
    * 예) 개인전 - `/speculation start world @a false`
    * 예) 팀전 - `/speculation start world @a true`

- 선택) 리소스팩 - `/speculation resourcepack`
  - 로컬에서 리소스팩을 미리 적용 시키지 않았다면 서버 접속 이전에 "서버 리소스팩" 설정을 허용으로 변경하시는 것을 권장합니다.

--- 

#### 지원하는 팀 색상 [사각형은 그룹매치 색상]

* ⬜ white
* ⬜ gray
* 🟥 red
* 🟥 dark_red
* 🟨 yellow
* 🟨 gold
* 🟩 green
* 🟩 dark_green
* 🟦 aqua
* 🟦 dark_aqua
* 🟪 light_purple
* 🟪 dark_purple

---

### 소스코드 수정이라는 끔찍한 도전을 하시는 분들을 위하여

이 프로젝트는 두개의 레이어로 분리되어 있습니다.

1. `speculation-core` = 실제 게임 실행 레이어
2. `speculation-plugin` = 진행 상황을 마인크래프트 서버(paper)에 보여주는 레이어

이 두 레이어가 상호작용하며 게임이 실행됩니다.

대부분의 진행은 `speculation-core` 에서 이뤄지며 플레이어의 응답이 필요한 경우

`speculation-plugin`에서 dialog를 수신해 플레이어의 응답을 전달합니다.

--- 

#### 참고

1. 모든 진행은 처음 사용해본 코루틴으로 작성했습니다.
2. 방송 컨텐츠를 한정한 코드를 작성하다보니 설정 대부분이 하드코딩되어 있습니다.

---

> ### 제작자
> * ✔️기본 건축물 - `adfgdfg` `✔️monun`
> * 시작 - `jung27`
> * ✔️감옥 - `✔️kinglee2005`
> * ✔️포탈 - `✔️degree2121`
> * ✔️축제 - `✔️coroskai`
> * ✔️국세청 - `✔️piese1028`
> * ✔️카지노 - `✔️piese1028`
> * ✔️이벤트카드 - `✔️degree2121`
> * ✔️봉화(10100) - `✔️monun`
> * ✔️영덕(12600) - `✔️adfgdfg` `eso136` `jangj` `mdjoon` `tbacaf`
> * ✔️의성(12400) - `✔️adfgdfg` `alexjang`
> * ✔️임실(11400) - `✔️app6460`
> * 예천(12500) - `pingu3628`
> * ✔️안동(10000) - `✔️adfgdfg` `degree2121`
> * ✔️평창(11900) - `implan` `irving_braxiatel` `✔️jhhan611` `piggy3590`
> * 보령(10200) - `traloc_dheckoa`
> * ✔️횡성(11300) - `adfgdfg` `✔️sgkill6`
> * ✔️강화(10900) - `✔️hgnb0508`
> * ✔️태백(12300) - `✔️adfgdfg` `degree2121`
> * ✔️동해(10800) - `✔️zlfn`
> * ✔️나주(11700) - `✔️degree2121` `moon0907` `pingu3628`
> * ✔️춘천(10500) - `information` `✔️pumkins2` `sssndw10` `tenthdoctor`
> * ✔️경주(11200) - `✔️adfgdfg` `jjoa` `jw`
> * ✔️포항(11800) - `✔️adfgdfg` `dytro`
> * ✔️속초(12200) - `chojinwoo` `✔️coroskai`
> * ✔️당진(10700) - `kde0607` `✔️piese1028` `pingu3628`
> * ✔️제주(11600) - `✔️menil`
> * ✔️김포(11000) - `✔️pparru`
> * ✔️창원(10400) - `✔️ikmyung`
> * ✔️세종(12000) - `✔️adfgdfg` `degree2121`
> * ✔️인천(11500) - `✔️degree2121` `ikohistory`
> * 광주(11100) - `adfgdfg`
> * ✔️대전(10600) - `cheonanstn` `✔️jjoa` `piese1028`
> * ✔️부산(10300) - `ghkdgnl` `✔️piese1028`
> * ✔️서울(12100) - `✔️megat88` `obinox`

---

Original Source by monun
