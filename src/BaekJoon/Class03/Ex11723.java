package BaekJoon.Class03;

import java.io.*;                                          // 입출력을 위한 java.io 패키지 전체 import
public class Ex11723 {                                     // Ex11723 클래스 선언
    public static void main(String[] args) throws IOException {  // main 메서드 선언, IOException 처리
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  // 빠른 출력용 BufferedWriter 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 빠른 입력용 BufferedReader 생성

        int bit = 0;                                       // 비트마스크를 저장할 정수 변수 초기화(모든 비트 0)
        int M = Integer.parseInt(br.readLine());           // 수행할 명령의 개수를 읽어 정수로 변환

        for (int i = 0; i < M; i++) {                      // M번 반복하면서 명령 처리
            String[] split = br.readLine().split(" ");     // 한 줄을 읽어 공백으로 분리하여 배열에 저장
            String cmd = split[0];                         // split[0]에 명령어(문자열)가 담김

            switch (cmd) {                                 // 명령어에 따라 분기 처리
                case "add": {                             // add x: 집합에 x 추가
                    int num = Integer.parseInt(split[1]); // x 값을 정수로 변환
                    bit |= 1 << num;                      // 비트연산 OR로 해당 비트를 1로 설정
                    break;                                // switch 탈출
                }
                case "remove": {                          // remove x: 집합에서 x 제거
                    int num = Integer.parseInt(split[1]); // x 값을 정수로 변환
                    bit &= ~(1 << num);                   // 비트연산 AND와 NOT으로 해당 비트를 0으로 설정
                    break;                                // switch 탈출
                }
                case "check": {                           // check x: x가 집합에 있는지 확인
                    int num = Integer.parseInt(split[1]); // x 값을 정수로 변환
                    // 비트마스크 AND로 확인 후, 1이면 “1\n”, 아니면 “0\n” 출력
                    bw.write(((bit & (1 << num)) != 0 ? "1" : "0") + "\n");
                    break;                                // switch 탈출
                }
                case "toggle": {                          // toggle x: x가 있으면 제거, 없으면 추가
                    int num = Integer.parseInt(split[1]); // x 값을 정수로 변환
                    bit ^= 1 << num;                      // XOR로 해당 비트 토글(0↔1)
                    break;                                // switch 탈출
                }
                case "all": {                             // all: 1부터 20까지 모두 추가
                    bit = (1 << 21) - 1;                  // 21개의 비트를 모두 1로 설정 (1~20번 비트 사용)
                    break;                                // switch 탈출
                }
                case "empty": {                           // empty: 집합을 완전히 비움
                    bit = 0;                              // 비트마스크를 0으로 초기화
                    break;                                // switch 탈출
                }
            }
        }
        bw.flush();                                       // 버퍼에 남은 출력 내용을 한 번에 밀어냄
        bw.close();                                       // BufferedWriter 종료
        br.close();                                       // BufferedReader 종료
    }
}


//public class Ex11723 {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        LinkedList<Integer> S = new LinkedList<>();
//        int M = Integer.parseInt(br.readLine());
//        StringTokenizer st = null;
//
//        for (int i = 0; i < M; i++) {
//            st = new StringTokenizer(br.readLine());
//            String str = st.nextToken();
//            if (str.equals("add")) {
//                int num = Integer.parseInt(st.nextToken());
//                S.add(num);
//            }
//            else if (str.equals("remove")) {
//                int num = Integer.parseInt(st.nextToken());
//                S.remove(Integer.valueOf(num));
//            }
//            else if (str.equals("check")) {
//                int num = Integer.parseInt(st.nextToken());
//                System.out.println(S.contains(num) ? "1" : "0");
//            }
//            else if (str.equals("toggle")) {
//                int num = Integer.parseInt(st.nextToken());
//                if (S.contains(num)) S.remove(Integer.valueOf(num));
//                else S.add(num);
//            }
//            else if (str.equals("all")) {
//              for (int j = 1; j <= 20; j++) {
//                  if (!S.contains(j)) S.add(j);
//              }
//            }
//            else if (str.equals("empty")) {
//              S.clear();
//            }
//          }
//      }
// }
