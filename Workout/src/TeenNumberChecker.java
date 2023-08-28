public class TeenNumberChecker {
    public static boolean hasTeen(int param1, int param2, int param3){
        boolean result = false;

        if((param1 < 13) || (param2 < 13) || (param3 < 13)){
            result = false;
        }else if((param1 > 19) || (param2 > 19) || (param3 > 19)){
            result = false;
        }else{
            if(check(param1)){
                result = true;
            } else if (check(param2)) {
                result = true;
            } else result = check(param3);
        }
        return result;
    }

    public static boolean isTeen(int oneParam){
        boolean b = check(oneParam);

        return b;
    }

    private static boolean check(int param){
        boolean result = false;
        for (int i = 13; i <= 19; i++) {
            //check param
            if(i == param){
                result = true;
                break;
            }
        }
        return result;
    }
}
