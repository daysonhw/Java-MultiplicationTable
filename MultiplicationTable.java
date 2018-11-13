public class MultiplicationTable {
    public static void main(String args[]){
        for (int column = 1; column < 10; column++){
            for(int row = 1; row < 10; row++){
                if (row == column) {
                    print(column,row,(column*row));
                    System.out.println();
                    break;
                }
                print(column,row,(column*row));
            }
        }
    }
    public static void print(int column,int row,int res){
        System.out.print(translation(toArray(row)));
        System.out.print(translation(toArray(column)));
        if (column * row < 10) {
            System.out.print("得");
        }
        System.out.print(translation(toArray(res)) + "   ");
    }

    private static int temp[] = new int[3];
    public static int[] toArray(int a){
        if (a > 9){
            if(a/10==1){
                temp[0] = 0;
            }else {
                temp[0] = a/10;
                temp[1] = 0;
            }
            temp[2] = a%10;
        }else {
            temp[0] = 10;
            temp[1] = 10;
            temp[2] = a;
        }
        return temp;
    }

    private static StringBuilder stringBuilder = new StringBuilder();
    public static String translation(int[] a){
        for (int b : a){
            switch (b){
                case 1:
                    stringBuilder.append("一");
                    break;
                case 2:
                    stringBuilder.append("二");
                    break;
                case 3:
                    stringBuilder.append("三");
                    break;
                case 4:
                    stringBuilder.append("四");
                    break;
                case 5:
                    stringBuilder.append("五");
                    break;
                case 6:
                    stringBuilder.append("六");
                    break;
                case 7:
                    stringBuilder.append("七");
                    break;
                case 8:
                    stringBuilder.append("八");
                    break;
                case 9:
                    stringBuilder.append("九");
                    break;
                case 0:
                    stringBuilder.append("十");
                    break;
                case 10:
                    break;
            }
        }
        String c = stringBuilder.toString();
        stringBuilder.setLength(0);
        return c;
    }
}