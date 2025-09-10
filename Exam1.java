public class Exam1 {

    public static void main(String[] args) {
        int age = 20;
        System.out.println("나이: " + age);

        String name = "한라봉";
        System.out.println("이름: " + name);

        // 1. 변수 apple에 12 대입(저장)
        int apple = 12;
        System.out.println("사과: " + apple);

        // 2. 변수 year에 2025 대입(저장)
        int year = 2025;
        System.out.println("연도: " + year);

        // 3. 변수 money에 -1000 대입(저장)
        int money = -1000;
        System.out.println("돈: " + money);

        // 4. 변수 length에 9.8 대입(저장)
        double length = 9.8;
        System.out.println("길이: " + length);

        // 5. 변수 score에 88.5 대입(저장)
        double score = 88.5;
        System.out.println("점수: " + score);

        // 6. 변수 minusValue에 -4.6 대입(저장)
        double minusValue = -4.6;
        System.out.println("음수값: " + minusValue);

        // 7. 변수 food에 "떡볶이" 대입(저장)
        String food = "떡볶이";
        System.out.println("음식: " + food);

        // 8. 변수 city에 "서울" 대입(저장)
        String city = "서울";
        System.out.println("도시: " + city);

        // 9. 변수 hobby에 "코딩" 대입(저장)
        String hobby = "코딩";
        System.out.println("취미: " + hobby);

        // 10. 변수 hasCar에 false 대입(저장)
        boolean hasCar = false;
        System.out.println("자동차인가요?: " + hasCar);

        // 11. 변수 isStudent에 true 대입(저장)
        boolean isStudent = true;
        System.out.println("학생인가요?: " + isStudent);

        // 12. 변수 isWeekend에 false 대입(저장)
        boolean isWeekend = false;
        System.out.println("주말인가요?: " + isWeekend);

        // ----------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");

        // 1. a = 10, b = 3에 값을 대입하여 산술 연산자 전부를 이용해 각 각 연산(+, -, *, /, %)
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. 12와 8을 더해서 sum 변수에 저장
        int sum = 12 + 8;
        System.out.println("sum = " + sum);

        // 3. 20을 3으로 나눈 몫을 total 변수에 저장
        int total = 20 / 3;
        System.out.println("total = " + total);

        // 4. 14를 5로 나눈 나머지를 mod 변수에 저장
        int mod = 14 % 5;
        System.out.println("mod = " + mod);

        // 5. 5 % 5 의 결과를 도출하는 과정 서술(왜 그런 결과값을 가지는가에 대해)
        //   : 5를 5로 나누었을 때, 몫이 1, 나머지가 0이므로 결괏값은 0
        System.out.println("5 % 5 = " + (5 % 5));

        // 6. 5 % 4 의 결과를 도출하는 과정 서술(왜 그런 결과값을 가지는가에 대해)
        //    : 5를 4로 나누었을 때, 몫이 1, 나머지가 1이므로 결괏값은 1
        System.out.println("5 % 4 = " + (5 % 4));

        // 7. 5 % 3 의 결과를 도출하는 과정 서술(왜 그런 결과값을 가지는가에 대해)
        //    : 5를 3으로 나누었을 때, 몫이 1, 나머지가 2이므로 결괏값은 2
        System.out.println("5 % 3 = " + (5 % 3));

        // 8. 5 % 2 의 결과를 도출하는 과정 서술(왜 그런 결과값을 가지는가에 대해)
        //    : 5를 2로 나누었을 때, 몫이 1, 나머지가 3이므로 결괏값은 3
        System.out.println("5 % 2 = " + (5 % 2));

        // 9. 5 % 1 의 결과를 도출하는 과정 서술(왜 그런 결과값을 가지는가에 대해)
        //    : 5를 1로 나누었을 때, 몫이 5, 나머지가 0이므로 결괏값은 0
        System.out.println("5 % 1 = " + (5 % 1));

        // 10. 5 % 7 의 결과를 도출하는 과정 서술(왜 그런 결과값을 가지는가에 대해)
        //    : 5를 7로 나누었을 때, 몫이 0, 나머지가 5이므로 결괏값은 5
        System.out.println("5 % 7 = " + (5 % 7));

        // 11. 5 % 0 의 결과를 도출하는 과정 서술(왜 그런 결과값을 가지는가에 대해)
        //    : 런타임 에러(ArithmeticException)가 발생한다.
        //      나머지 연산을 수행하려면 나누는 수가 0이 아니어야 한다.
        // System.out.println("5 % 0 = " + (5 % 0));

        // 12. 15가 20보다 큰지 result1에 저장
        boolean result1 = 15 > 20;
        System.out.println("result1 = " + result1);

        // 13. 10과 10이 같은지 result2에 저장
        boolean result2 = 10 == 10;
        System.out.println("result2 = " + result2);

        // 14. 7이 3보다 작거나 같은지 result3에 저장
        boolean result3 = 7 <= 3;
        System.out.println("result3 = " + result3);

        // 15. a = 5, b = 7 변수에 대입하여 비교 연산자 전부를 이용해 각 각 연산
        a = 5;
        b = 7;
        System.out.println("a == b ? " + (a == b));
        System.out.println("a != b ? " + (a != b));
        System.out.println("a > b ? " + (a > b));
        System.out.println("a < b ? " + (a < b));
        System.out.println("a >= b ? " + (a >= b));
        System.out.println("a <= b ? " + (a <= b));

        // 16. 10이 5보다 크고 2가 1보다 큰지 logic1에 저장
        boolean logic1 = (10 > 5) && (2 > 1);
        System.out.println("(10 > 5) && (2 > 1) ? " + logic1);

        // 17. 3이 7과 같거나, 6이 2보다 작은지 logic2에 저장
        boolean logic2 = (3 == 7) || (6 < 2);
        System.out.println("(3 == 7) || (6 < 2) ? " + logic2);

        // 18. 8이 8과 같지 않은지 logic3에 저장
        boolean logic3 = (8 != 8);
        System.out.println("(8 != 8) ? " + logic3);

        // 19. x = true, y = false 변수에 대입하여 논리 연산자 전부를 이용해 각 각 연산
        boolean x = true;
        boolean y = false;
        System.out.println("(x && y) ? " + (x && y));
        System.out.println("(x || y) ? " + (x || y));
        System.out.println("!x ? " + !x);
        System.out.println("!y ? " + !y);
    }
}
