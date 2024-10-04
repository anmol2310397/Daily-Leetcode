class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        if(skill.length==2)
            return (skill[0]*skill[1]);
        if(skill.length%2==1)
            return -1;
        for(int i=0;i<skill.length/2;i++)
        {
            if((skill[i]+skill[skill.length-i-1])!=(skill[i+1]+skill[skill.length-i-2]))
                return -1;
        }
       
            long num=0;
        
           
                
        for(int i=0;i<skill.length/2;i++)
        {
            
            num+=skill[i]*skill[skill.length-i-1];
            
        }
            
            return num;
    }
    
}