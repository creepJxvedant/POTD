import java.util.HashMap;
class FindSumPairs {

    private int num1[];
    private int num2[];
    private HashMap<Integer,Integer> map;


    public FindSumPairs(int[] nums1, int[] nums2) {
        
         num1=nums1;
         num2=nums2;
         map=new HashMap<>();

          for(int num:nums2)
           map.put(num,map.getOrDefault(num,0)+1);
        
    }
    
    public void add(int index, int val) {

       int num=num2[index];
       map.put(num,map.get(num)-1);       

       if(map.get(num)<=0)
         map.remove(num);
       
       num2[index]+=val;
       num=num2[index]; 

       map.put(num,map.getOrDefault(num,0)+1);        
    }
    
    public int count(int tot) {
     
     int c=0;
     for(int num:num1){
         c+=map.getOrDefault((tot-num),0);
     }

  return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */