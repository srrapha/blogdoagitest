package datafactory;

import dto.SearchDTO;
import utils.Setup;

import static constants.Constants.SEARCH_VALUE_SUCESS;
import static utils.DataFaker.getSearchValueRandom;

public class SearchFactory extends Setup {


    public SearchDTO buildSearchSucess (){

        return SearchDTO.builder().
                searchValue(SEARCH_VALUE_SUCESS)
                .build();

    }

    public SearchDTO buildSearchNotFound (){

        return SearchDTO.builder().
                searchValue(getSearchValueRandom())
                .build();

    }

}
