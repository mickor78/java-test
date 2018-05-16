package pl.sii.eu;


/**
 * Implementation of DuplicateChecker interface
 *
 * @author Michal Korzeniewski
 * @email mickor78@gmail.com
 */
public class DuplicateCheckerImplementation implements DuplicateChecker {


    /**
     * Overrided method checking if input has duplicate characters
     *
     * @param input
     * @return boolean
     */
    @Override
    public boolean hasDuplicateCharacters(String input) {
        boolean hasDuplicateChar = false;
        if(input.isEmpty()||input.length()==1) return hasDuplicateChar;

        for (int i = 0; i < input.length()-1 ; i++) {
            if(input.substring(i)=="\\s") continue;
            char current = input.charAt(i), next = input.charAt(i+1);
            if (current==next) hasDuplicateChar = true;
        }
        return hasDuplicateChar;
    }
}
