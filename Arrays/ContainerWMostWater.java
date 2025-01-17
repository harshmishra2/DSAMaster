class ContainerWMostWater {

    public static void main(String [] args){
        int [] arr = new int[] {4, 3, 2, 1, 1, 2, 3, 4, 5};
        System.out.println("The max possible area is - "+ maxArea(arr));
    }


    public static int maxArea(int[] height) {
        int end = height.length -1;
        int start = 0;
        int area = 0;

        while(start<end){
            if(height[start]>height[end]){
                int curArea = (end-start)*height[end];
                end--;
                if(curArea>area){
                    area = curArea;
                }
            }
            else{
                int curArea = (end-start)*height[start];
                start++;
                if(curArea>area){
                    area = curArea;
                }
            }
            
        }
        return area;
    }
}

//https://leetcode.com/problems/container-with-most-water/submissions/?envType=study-plan-v2&envId=top-interview-150
