## 과제 설명

CLI 프로그램 제작 (동기 프로그램)
* 콘솔 형태의 프로그램은 어떠한 종류라도 상관 없습니다.
- 예시 [링크](https://www.youtube.com/watch?v=EKy4m5FxhjE)

* 과제는 다음 순서대로 진행을 합니다.

1. 프로그램 클래스 설계도(다이어그램) 작성하기

1.1 속성, 메서드, 상속의 관계를 먼저 정의 합니다.
- 예시 [링크](https://blog.kakaocdn.net/dn/KKHyA/btrb7uJR0y0/fCTJikYRHAQWhJP5yA3x00/img.png)
  `(만약 어렵다면 사람 클래스부터 해보세요. 조부모 클래스, 부모 클래스, 자식클래스 3개 클래스로 작성을 먼저 해보세요)`

1.1.1 2차 상속은 최소 하나가 있으면 좋겠습니다.

`* UML 프로그램 사용 금지, 손으로 그리세요! 
이유: 툴 학습법 익힐 시간 없음 
제출은 사진찍어 제출하시면 됩니다.`

2. 설계도 기반 콘솔 프로그램 제작
   2.1 사용자에게 입력을 받고 진행이 되는 형태가 되어야 합니다.

## 주제 및 설계

[주제]

스타트업 대표인 noah는 회사에 필요한 인원과 함께할 때 필요한 팀원들의 연봉을 계산해보기 위해 프로그램을 제작하고 있다.

noah가 생각했을때 필요한 직군은 다음과 같다.

초기 스타트업을 고려했을때 인원은 1명씩만 배정하기로 하였다.

- PM (Product Manager)
- Frontend Developer
- Backend Developer
- Data Scientist
- Marketing
- UI/UX 디자이너
- DevOps Engineer
- Finance Manager

각 직무마다 필요한 연차(연봉)을 선택했을 때, 총 연봉(비용)을 계산해주는 프로그램을 제작하세요.

또한, 선택이 완료된 후 재선택할 수 있는 선택지를 주어 선택한 직무의 인원을 재선택할 수 있도록 구현하세요.

### 입력

- 각 직군별 연봉
    - 주어진 연봉표에서 선택하세요.
    - 올바르지 못한 연봉을 선택하는 예외처리 필요
- 재입력 받을 직군 번호 (1 ~ 8)
    - -1 : 종료
    - 유효하지 않은 직군 번호를 선택하는 예외처리 필요

### 출력

- 각 직군의 연봉
- 모든 직군 연봉의 합
- 각 직군의 각오

### 클래스 다이어그램(설계)

![classDiagram](https://github.com/user-attachments/assets/4b39d7e8-ea4e-44a9-8fdf-c6175cb7d170)


### 실행 결과 영상

![GIFMaker_me](https://github.com/user-attachments/assets/afa5c0cc-ec99-497b-a0b0-fd75a67119e0)



