public class phrase_omatric {
    public static void main (String[] args){
        // make three sets of words to choose from 
        String[] wordListOne = {
            "linear regression", "logistic regression","Naive Bayes"
        }; 
        String[] wordListTwo = {
            "convolutional neural networks", "artificial neural networks", "recurrent neural networks","lstms","GRUs"
        }; 

        // finding out how many words in each list 
        int oneLength  = wordListOne.length;
        int twoLength = wordListTwo.length; 

        // generate two random numbers 
        int rand1 = (int) (Math.random() * oneLength) ; 
        int rand2 = (int) (Math.random() * twoLength); 


        // now build a phrase 
        String phrase = wordListOne[rand1]+","+wordListTwo[rand2] ; 
        System.out.println("selected topics are " + phrase);


        int min_ = 2; 
        int max_ = 7;
        int x = 0 ; 
        while (x<10){
            //getting random numbers between 2 and 7; 
            int rn = min_ + (int)(Math.random()*((max_-min_)+1)); 
            System.out.println(rn);
            x=x+1; 
        }
    }
}
