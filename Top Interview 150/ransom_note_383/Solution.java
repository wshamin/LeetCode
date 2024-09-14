package ransom_note_383;

public class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int elementsFound = 0;

        char[] ransomNoteAsArray = ransomNote.toCharArray();
        char[] magazineAsArray = magazine.toCharArray();

        for (char c : ransomNoteAsArray) {
            for (int j = 0; j < magazineAsArray.length; j++) {
                if (c == magazineAsArray[j]) {
                    magazineAsArray[j] = ' ';
                    elementsFound++;
                    break;
                }
            }
        }

        return elementsFound == ransomNoteAsArray.length;
    }
}