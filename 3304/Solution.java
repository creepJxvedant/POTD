package potd;

public class Solution{
        public char kthCharacter(int k) {

            int len=1;
            while(len<k){
                len=len<<1;
            }

            char arr[]=new char[len+1];
            arr[0]='a';

            int count=1;
            int idx=1;
            while (count<k){
                for(int j=0;j<count && idx<arr.length;j++) {
                    arr[idx++] = (char) ((((arr[j] - 'a') + 1) % 26) + 'a');
                }
                count<<=1;
            }

            return arr[k-1];
        }
    }