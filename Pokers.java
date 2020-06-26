public class Pokers{
    String[] card = new String[5];
    char[] color = new char[5];
    char[] number = new char[5];


    public void CreateCard(String Card1,String Card2,String Card3,String Card4,String Card5) {
    this.card[0]=Card1;
    this.card[1]=Card2;
    this.card[2]=Card3;
    this.card[3]=Card4;
    this.card[4]=Card5;

    this.color[0]=card[0].charAt(1);
    this.color[1]=card[1].charAt(1);
    this.color[2]=card[2].charAt(1);
    this.color[3]=card[3].charAt(1);
    this.color[4]=card[4].charAt(1);

    this.number[0]=card[0].charAt(0);
    this.number[1]=card[1].charAt(0);
    this.number[2]=card[2].charAt(0);
    this.number[3]=card[3].charAt(0);
    this.number[4]=card[4].charAt(0);
     }

}