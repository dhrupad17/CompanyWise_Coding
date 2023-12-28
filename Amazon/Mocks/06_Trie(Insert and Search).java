/*
Trie | (Insert and Search)

Trie is an efficient information retrieval data structure. Use this data structure to store Strings and search strings. Your task is to use TRIE data structure and search the given string A. If found print 1 else 0.

Example 1:

Input:
N = 8
key[] = {the,a,there,answer,any,by,
         bye,their}
search = the
Output: 1
Explanation: the is present in the given
string "the a there answer any by bye
their"
Example 2:

Input:
N = 8
key[] = {the,a,there,answer,any,by,
         bye,their}
search = geeks
Output: 0
Explanation: geeks is not present in the
given string "the a there answer any by
bye their"
*/
static void insert(TrieNode root, String key) 
{
    // Your code here
    TrieNode currNode=root;
    for(int i=0;i<key.length();i++)
    {
       char curr=key.charAt(i);
       if(currNode.children[curr-'a']==null){
           TrieNode newNode=new TrieNode();
           currNode.children[curr-'a']=newNode;
       }
       currNode=currNode.children[curr-'a'];
    }
    currNode.isEndOfWord=true;
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    // Your code here
    TrieNode currNode=root;
    for(int i=0;i<key.length();i++)
    {
       char curr=key.charAt(i);
       if(currNode.children[curr-'a']==null){
           return false;
       }
       currNode=currNode.children[curr-'a'];
    }
    return currNode.isEndOfWord;
}