/*
Unique Words from Two Sentences

given two sentences A and B of lower case letters task is to find the unique words and make a list and sort the words alphabetically. unique words mean the word is present exactly once in one of the sentences and not appear again in other sentence.

example

i have a blue pen
i got a red pen

output
blue got have red
*/
class Sol
{
    ArrayList<String> uniqueWords(String A , String B)
        {
            //code here.
            String s=A+" "+B;
            String words[]=s.split("\\s+");
            
            Map<String,Integer> hm=new HashMap<>();
            for(String word:words){
                hm.put(word,hm.getOrDefault(word,0)+1);
            }
            
            ArrayList<String> list=new ArrayList<>();
            for(Map.Entry<String,Integer> entry:hm.entrySet()){
                if(entry.getValue()==1)
                    list.add(entry.getKey());
            }
            Collections.sort(list);
            
            return list;
        }
}