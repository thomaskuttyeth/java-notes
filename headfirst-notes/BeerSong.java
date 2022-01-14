
public class BeerSong {
    public static void main(String[] args){
        int beerNum = 99; 
        String word = "bottles";
        while(beerNum>0){
            if (beerNum ==1){
                word = "bottle"; // singular, as in one bottle 
            }else{
                word = "bottles"; 
            }
            System.out.println(beerNum +" " + word + " of beer on the wall");
            beerNum =beerNum - 1;
        }
    }
}
