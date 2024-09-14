package ransom_note_383;

public class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int elementsFound = 0;

        char[] ransomNoteAsArray = ransomNote.toCharArray();
        char[] magazineAsArray = magazine.toCharArray();

        for (int i = 0; i < ransomNoteAsArray.length; i++) {
            for (int j = 0; j < magazineAsArray.length; j++) {
                if (ransomNoteAsArray[i] == magazineAsArray[j]) {
                    magazineAsArray[j] = ' ';
                    elementsFound++;
                    break;
                }
            }
        }

        if (elementsFound == ransomNoteAsArray.length) {
            return true;
        }

        return false;
    }
}