public class SkillDemo{
//I will pull code that I wrote to make the video shorter

//check if the input number is a prime number
static boolean isPrime(int input){

    boolean isPrime = true;

    if(input <= 1){
        isPrime = false;
        return isPrime;
    }else{
        for(int i = 2; i<= input/2;i++){
            if((input%i)==0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}

}
