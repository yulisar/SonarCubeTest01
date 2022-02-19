/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasonartest;

import java.util.LinkedHashMap;
import java.util.Optional;

/**
 *
 * @author yul
 */
public class JavaSonarTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        throw new UnsupportedOperationException();
    }
    
    public String getSomething(DtoParamPaging input) {
        String xx = "";
        Optional<DtoParamPaging> gotinput = Optional.ofNullable(input);
            if (gotinput.isPresent()) {
                Optional<LinkedHashMap<String,Object>> searched = Optional.ofNullable((LinkedHashMap<String,Object>) gotinput.get().getSearch());
                if (searched.isPresent()) {
                    Optional<Boolean> blov = Optional.ofNullable((Boolean) searched.get().get("lov"));
                    if (blov.isPresent() && Boolean.TRUE.equals(isLovTrue(blov)) ) {
                            xx = blov.get().toString();
                    }
                }
            }
        return xx;
    }
    
    private static Boolean isLovTrue(Optional<Boolean> lovtrue) {
        if (lovtrue.isPresent()) {
            return Boolean.TRUE.equals(lovtrue.get());
        } 
        return false;
        
    }
    
    
    
    
}
