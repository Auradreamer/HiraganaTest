# HiraganaTest

We are the fans of learning Japanese. This app is aiming to assist us with practicing Hiragana in a fun way. 

Initially, there are two parts of this app. The first part is about randomly giving the Japanese character for users to enter the right pronoucation for it (which is the test 1).

There are two ways considered for the storage of the characters.

---- Since there are two components for each one, the hiragana character and its corresponding sound. One can think of is to use the Hashtable which is taking advantage of the key,value pair. What's more, given the value, the complexity of finding the key is O(1).

---- The second method could be using Android String Array. We can simply store them in the strings.xml and they could be simply used by the Activity files. The character and the sound could be connected through their index. The tricky thing is in order to use these two array efficiently, we find it is better to convert the string arrays to arraylists. Since the arraylist has much more and better features to be used.
