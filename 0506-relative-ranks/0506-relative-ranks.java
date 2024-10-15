class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair<Integer,Integer>>pq=new PriorityQueue<>((a,b)->b.getKey()-a.getKey());
        for(int i=0;i<score.length;i++)
            
        {
            pq.add(new Pair<>(score[i],i));
        }
        String str[]=new String[score.length];
        int place=1;
        for(int i=0;i<score.length;i++)
        {
            Pair<Integer,Integer> pair=pq.poll();
            int ogindex=pair.getValue();
            if(place==1)
                str[ogindex]="Gold Medal";
            else if(place==2)
                str[ogindex]="Silver Medal";
            else if(place==3)
                str[ogindex]="Bronze Medal";
            else
                str[ogindex]=String.valueOf(place);
            place++;
        }
        return str;
    }
}