Problem Link: https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1

Code:

ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i=0,j=0;
        
        while(i<k) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            i++;
        }
        
        ans.add(map.size());
        
        while(i<arr.length) {
            map.put(arr[j], map.get(arr[j])-1);
            
            if (map.get(arr[j]) == 0) {
                map.remove(arr[j]);
            }
            
            j++;
            
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            
            ans.add(map.size());
            i++;
        }
        
        return ans;
    }
