        if(dp[left][right]!=null){
        }
            return nums[left];
            return dp[left][right];
        }
        int takeLeft=nums[left]-solve(nums,left+1,right);
        int takeRight=nums[right]-solve(nums,left,right-1);

        if(left==right){
    private int solve(int[]nums,int left,int right){
    }
        return solve(nums,0,n-1)>=0;
        dp=new Integer[n][n];
        int n=nums.length;
        dp[left][right]=Math.max(takeLeft,takeRight);

        return dp[left][right];
    }
