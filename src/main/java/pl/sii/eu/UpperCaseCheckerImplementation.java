package pl.sii.eu;

import pl.sii.eu.UpperCaseChecker;


/**
 * Class implements UpperCaseChecker interface.
 *
 * @author Michal Korzeniewski
 * @email mickor78@gmail.com
 */
public class UpperCaseCheckerImplementation implements UpperCaseChecker {

    /**
     * Overrided method from UpperCaseChecker interface
     *
     * @param input
     * @return boolean isUpperCase
     */
    @Override
    public boolean hasUpperCaseLetters(String input) {
        boolean isUpperCase = false;
        for (char c : input.toCharArray()
                ) {
            if (Character.isUpperCase(c)) {
                isUpperCase = true;
            }
        }
        return isUpperCase;
    }
}
