# Intuition
Instantly knew that the problem statement indirectly indicated that individual timings of trucks was not co-dependant on timings of other trucks.


# Approach - 1
My initial approach was to go through each character from each string individually and adding up timings to the total counter.

Steps - 
1. Itearate over each character of each string and add timings accordingly
2. Note the position of last occurance of each of glass, metal, paper garbage
3. Iterate over the travel array and add timings according to the last occurance of each type of garbage

# Complexity
- Time complexity: O((_n * m_) + (_n -  1_)) => O(_n *_(_m - 1_))
where, 
    - n is number of houses
    - m is average garbage per house

**Beats 55%**

# Code
```
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int glass_time = 0, metal_time = 0, paper_time = 0, travel_time = 0, glass_pos = 0, metal_pos = 0, paper_pos = 0;
        for(int i = 0; i < garbage.length; i++) {
            char[] current_gb = garbage[i].toCharArray();
            for(char ch: current_gb) {
                if(ch == 'G') {
                    glass_time++;
                    glass_pos = i;
                }
                if(ch == 'M') {
                    metal_time++;
                    metal_pos = i;
                }
                if(ch == 'P') {
                    paper_time++;
                    paper_pos = i;
                }
            }
        }

        for(int i = 0; i < travel.length; i++) {
            if(i < glass_pos) travel_time += travel[i];
            if( i < metal_pos) travel_time += travel[i];
            if( i < paper_pos) travel_time += travel[i];
        }

        return glass_time + metal_time + paper_time + travel_time;
    }
}
```

# Approach - 2
Not being satisfied with the result I started looking for a better approach. Then it struck me that since all the individual truck timings get add up anyway I don't have to keep track of timings of individual garbage but only identify the last occurance of each type of grabage.

Steps - 
1. Define a total time variable `ans`
2. Iterate through `travel` array and add `travel[i] * 3` and `garbage[i].length`
3. Next, again iterate over travel times from the end and keep substracting `travel[i - 1]` for each category of garbage until you find it's last occurance
4. Break the loop if all last occurances are found 

# Complexity
- Time complexity: O(_n_)
where,
    - n  is number if houses


# Code
```
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans = 0;
        boolean lastM = false, lastG = false, lastP = false;
        int n = garbage.length;
        for(int i = 0; i <= n - 1; i++) {
            if(i < n - 1) ans += travel[i] * 3;
            ans += garbage[i].length();
        }
        for(int i = n - 1; i > 0; i--) {
            if(!lastG) {
                if (garbage[i].contains("G")) lastG = true;
                else ans -= travel[i - 1];
            }
            if(!lastM) {
                if (garbage[i].contains("M")) lastM = true;
                else ans -= travel[i - 1];
            }
            if(!lastP) {
                if (garbage[i].contains("P")) lastP = true;
                else ans -= travel[i - 1];
            }
            if(lastP && lastG && lastM) {
                break;
            }
        }

        return ans;
    }
}
```
