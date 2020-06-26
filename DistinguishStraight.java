public class DistinguishStraight {
    public static Integer DisS(Pokers poker) {
        int[] Num = new int[5];
        int Return =0;
        for(int i=0;i<5;i++){
            switch(poker.number[i]){
                case '2':Num[i]=2; break;
                case '3':Num[i]=3; break;
                case '4':Num[i]=4; break;
                case '5':Num[i]=5; break;
                case '6':Num[i]=6; break;
                case '7':Num[i]=7; break;
                case '8':Num[i]=8; break;
                case '9':Num[i]=9; break;
                case 'T':Num[i]=10; break;
                case 'J':Num[i]=11; break;
                case 'Q':Num[i]=12; break;
                case 'K':Num[i]=13; break;
                default:System.out.println("输入错误");
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(Num[j]>Num[j+1]){
                    int Change=0;
                    Change=Num[i];
                    Num[i]=Num[i+1];
                    Num[i+1]=Change;
                }
            }
        }
        for(int i=0;i<4;i++){
            if(Num[i]+1==Num[i+1])
                Return=1;
            else
                Return=0;
        }
        return Return;
    }
    
}