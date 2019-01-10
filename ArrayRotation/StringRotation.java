package ArrayRotation;

public class StringRotation {

    public String checkString(String A, int k){
        char A_temp[]= A.toCharArray();

        k=k%A_temp.length;
        int count=0;
        for(int i=0; count<A_temp.length; i++ ){
            int start= i;
            char prev= A_temp[i];
            do{
                int temp_index= (start+k)%A_temp.length;
                char temp = A_temp[temp_index];
                A_temp[temp_index]=prev;
                prev=temp;
                start=temp_index;
                count++;
            }
            while(start!=i);
        }

        A= new String(A_temp);


        return A;
    }


    public boolean rotateString(String A, String B) {

        for(int i=0; i <A.length(); i++)
            if(checkString(A, i).equals(B)){
                return true;
            }

        return false;
    }

    public boolean isContains(String A, String B){
        A=A+A;

        if(A.contains(B)){
            return true;
        }
        return false;
    }


    public static void main(String args[]){

        String A= "Kedar";
        String B= "arKed";

        System.out.println("Strings A and B rotated are : "+new StringRotation().rotateString(A, B));

        System.out.println("Strings A and B rotated are : "+new StringRotation().isContains(A, B));
    }
}
