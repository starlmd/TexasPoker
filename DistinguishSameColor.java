public class DistinguishSameColor {
    public static Integer DisC(Pokers poker) {
        int Return=0;
        for(int i=0;i<4;i++){
            if(poker.color[i]==poker.color[i+1])
                Return=1;
            else
                Return=0;
        }
        return Return;       
    }
}