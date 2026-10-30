public class second {
    static void main(String[] args) {
        int [] num = {10,20,10,40,60};

        int largest = num[0];

        for(int i=1 ;i<num.length;i++){
            if (num[i]>largest){
                largest=num[i];
            }
            System.out.println(largest);
        }
    }
}
