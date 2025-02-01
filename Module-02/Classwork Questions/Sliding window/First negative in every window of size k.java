Problem Link: https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

static List<Integer> FirstNegativeInteger(int arr[], int k) {
        // write code here
        Queue<Integer> q = new LinkedList<>();
        
        int i=0,j=0;
        List<Integer> ans = new ArrayList<>();
        
        while(i<k) {
            if (arr[i] < 0) q.add(arr[i]);
            i++;
        }
        
        if (q.size() > 0) ans.add(q.peek());
        else ans.add(0);
        
        while(i < arr.length) {
            if (q.size() > 0 && arr[j] == q.peek()) q.remove();
            if (arr[i] < 0) q.add(arr[i]);
            
            if (q.size() > 0) ans.add(q.peek());
            else ans.add(0);
            
            i++;
            j++;
        }
        
        return ans;
    }
