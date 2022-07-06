import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class checkPanagramTest {

    @Test
    public void emptyIsNotAPanagram(){
        Assertions.assertEquals(-1, PanagramCheck.checkPanagram(""));
    }

    @Test
    public void alphabetIsPanagram(){
        Assertions.assertEquals(0, PanagramCheck.checkPanagram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void alphabetIsDuplicate(){
        Assertions.assertEquals(1, PanagramCheck.checkPanagram("aaaaabcdefgggghijkkkkkklmmmmmmnopqrstuvwxyzz"));
    }

    @Test
    public void alphabetIsNotPanagram(){
        Assertions.assertEquals(-1, PanagramCheck.checkPanagram("abcdefghijklmnopqrstuvwwwww"));
    }

    @Test
    public void alphabetCaseIsPanagram(){
        Assertions.assertEquals(0, PanagramCheck.checkPanagram("AbcDefghIjKLmnOPqRSTUvwxyz"));
    }

    @Test
    public void alphabetCaseIsNotPanagram(){
        Assertions.assertEquals(-1, PanagramCheck.checkPanagram("bcDefzghIjKALmRSTUvwxy"));
    }

    @Test
    public void alphabetPunctuatedIsPanagram(){
        Assertions.assertEquals(0, PanagramCheck.checkPanagram("abcd;efgh,ijkl.mnop]qrst?uvw[xyz"));
    }

    @Test
    public void alphabetPunctuatedIsNotPanagram(){
        Assertions.assertEquals(-1, PanagramCheck.checkPanagram("bd;efh,ijkl.mnp]qrst?uw[xyz"));
    }

    @Test
    public void alphabetFrequencyIsPanagram(){
        Assertions.assertEquals(1, PanagramCheck.checkPanagram("aabbccddeeffgghhiijjkkllmnopqqrrrsttuvwxxyz"));
    }

    @Test
    public void alphabetFrequencyIsNotPanagram(){
        Assertions.assertEquals(-1, PanagramCheck.checkPanagram("bbccddeeffgghhiijjkkllmnopqqrrrsttuvwxxyz"));
    }


    @Test
    public void alphabetMixedIsPanagram(){
        Assertions.assertEquals(0, PanagramCheck.checkPanagram("obzdefhivajklmnwpqrsctuxgy"));
    }

    @Test
    public void alphabetMixedIsNotPanagram(){
        Assertions.assertEquals(-1, PanagramCheck.checkPanagram("obzdefhivajkmnwpqrsctuxgy"));
    }

    @Test
    public void alphaNumericIsPanagram(){
        Assertions.assertEquals(0, PanagramCheck.checkPanagram("32ab2c2defgh24i4jklmno44p5qrstu37vwxy23z"));
    }

    @Test
    public void alphaNumericIsNotPanagram(){
        Assertions.assertEquals(-1, PanagramCheck.checkPanagram("32ab2c2def24i4jklo44p5qrstu37vy23z"));
    }

    @Test
    public void alphabetWithSpacesIsPanagram(){
        Assertions.assertEquals(0, PanagramCheck.checkPanagram("a  b cd efg  hi jk l mno  pqr st u vw  x yz  "));
    }

    @Test
    public void alphabetWithSpacesIsNotPanagram(){
        Assertions.assertEquals(-1, PanagramCheck.checkPanagram("  b cd efg  hi jk l mno  pqr st u vw  x yz  "));
    }
}