public class DistinguishSameTimes {
    public static Integer Dis(final Pokers poker){
        final int[] SameNumber= new int[4];
        final int[] SameTimes = new int[4];
        int Return=0;
        for(int i=0;i<4;i++){
            SameNumber[i]=0;
            SameTimes[i]=1;
        }
        for(int i=0;i<4;i++){
                for(int j=i+1;j<5;j++){
                    if(poker.number[i]==poker.number[j]){
                        SameNumber[i]=poker.number[i];
                        SameTimes[i]++;
                    }
                }
         }
        int Timemax=0;
		int DoubleTime=0;
        for(int i=0;i<3;i++){
            if(SameTimes[i]<SameTimes[i+1]){
                Timemax=SameTimes[i+1];
            }
            for(int j=i+1;j<3;j++){
                if(SameTimes[i]==SameTimes[j]){
                    DoubleTime++;
                }
            }
        } 
        if(Timemax==2&&DoubleTime==0)
            Return=2;
        else if(Timemax==2&&DoubleTime==1)
            Return=3;
        else if(Timemax==3)
            Return=4;
        
        return Return;
        }
    }
