package org.skillbrain.lucianSimon.Tema3;

public class PigLatinTranslator {

    public static void main(String[] args) {
        int z=0;
        String word = "each mountain";
        PigLatinTranslator pig = new PigLatinTranslator();
        System.out.println(pig.translate(word));
    }

    public String translate(String sentence) {
        String[] words = sentence.split(" ");//pune propozitia in array prin split scoate spatii
        String result = "";
        for (int index = 0; index < words.length; index++) {//parcurg array
            result += evaluate(words[index]);// modificare rezultat evaluare pe cuvant cu enuntul din instructiuni
            if (index != words.length - 1) {// adaug spatiu intre cuvinte
                result += " ";
            }
        }
        return result;
    }


    private String evaluate(String word) {
        String response = "";
        if (isFourthRuleApplicable(word)) {
            response = word.substring(1, 2) + word.substring(0, 1) + "ay";
        } else {
            if (isFirstRuleApplicable(word)) {
                response = word + "ay";
            } else if (isThirdRuleApplicable(word)) {
                boolean startWithThreeConsonantsGroup = false;

                switch (word.substring(0, 3)) {
                    case "thr":
                    case "sch":
                    case "squ":
                        response = word.substring(3) + word.substring(0, 3) + "ay";
                        startWithThreeConsonantsGroup = true;
                        break;
                    default:
                        break;
                }
                if (!startWithThreeConsonantsGroup) {
                    switch (word.substring(0, 2)) {
                        case "th":
                        case "ch":
                        case "rh":
                        case "qu":
                            response = word.substring(2) + word.substring(0, 2) + "ay";
                            break;
                        default:
                            break;
                    }
                }
            } else if (isSecondRuleApplicable(word)) {
                response = word.substring(1) + word.substring(0, 1) + "ay";
            }
        }
        return response;
    }

    private boolean isFirstRuleApplicable(String word) {// se uita in array si vede daca regula este aplicabila
        String firstLetter = word.substring(0, 1);
        String firstTwoLetters = word.substring(0, 2);
        String[] vowelsSound = {"a", "e", "i", "o", "u", "xr", "yt"};
        for (int j = 0; j < vowelsSound.length; j++) {
            String soundToCompare = vowelsSound[j];
            if (firstLetter.equals(soundToCompare) || firstTwoLetters.equals(soundToCompare)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSecondRuleApplicable(String word) {
        return !isFirstRuleApplicable(word);
    }

    private boolean isThirdRuleApplicable(String word) {
        String firstTwoLetters = word.substring(0, 2);
        String firstThreeLetters = word.substring(0, 3);
        String[] consonantsGroup = {"th", "thr", "ch", "sch", "rh", "squ", "qu"};
        for (int j = 0; j < consonantsGroup.length; j++) {
            String soundToCompare = consonantsGroup[j];
            if (!isFirstRuleApplicable(word) && firstTwoLetters.equals(soundToCompare) || firstThreeLetters.equals(soundToCompare)) {
                return true;
            }
        }
        return false;
    }

    private boolean isFourthRuleApplicable(String word) {
        if (word.length() == 2) {
            String secondLetter = word.substring(1, 2);
            if (secondLetter.equals("y")) {
                return true;

            }
        }
        return false;

    }

}
