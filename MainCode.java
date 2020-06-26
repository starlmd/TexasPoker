import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class MainCode {
    public static void main(String[] args) throws IOException {
        Pokers poker1 = new Pokers();
        Pokers poker2 = new Pokers();
        String[] p1 = new String[5];
        String[] p2 = new String[5];
        System.out.print("输入：Black:");
        for (int i = 0; i < 5; i++) {
            InputStream input = System.in;
            BufferedReader buf = new BufferedReader(newInputStreamReader(input));
            String str1 = buf.readLine();
            p1[i] = str1;
        }
        System.out.print("White:");
        for (int i = 0; i < 5; i++) {
            InputStream input = System.in;
            BufferedReader buf = new BufferedReader(newInputStreamReader(input));
            String str2 = buf.readLine();
            p2[i] = str2;
        }
        poker1.CreateCard(p1[0], p1[1], p1[2], p1[3], p1[4]);
        poker2.CreateCard(p2[0], p2[1], p2[2], p2[3], p2[4]);
        int P1IsSameColor = DistinguishSameColor.DisC(poker1);
        int P2IsSameColor = DistinguishSameColor.DisC(poker2);

        int P1IsSameTimes = DistinguishSameTimes.Dis(poker1);
        int P2IsSameTimes = DistinguishSameTimes.Dis(poker2);

        int P1IsStraight = DistinguishStraight.DisS(poker1);
        int P2IsStraight = DistinguishStraight.DisS(poker2);

        int P1Score=P1IsSameTimes,P2Score=P2IsSameTimes;
        if(P1IsStraight!=0)
            P1Score=5;
        if(P2IsStraight!=0)
            P2Score=5;
        if(P1IsSameColor !=0 && P1IsStraight ==0)
            P1Score=6;
        if(P2IsSameColor !=0 && P2IsStraight ==0)
            P2Score=6;
        if(P1IsSameColor !=0 && P1IsStraight !=0)
            P1Score=7;
        if(P2IsSameColor !=0 && P2IsStraight !=0)
            P2Score=7;
        if(P1Score>P2Score)
            System.out.print("输出 Black win!");
        else    
            System.out.print("输出 White win!");
    }

    private static Reader newInputStreamReader(InputStream input) {
        return null;
    }
}
