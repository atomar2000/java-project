class CityException extends Exception{                               //
    CityException(String s){                         //CUSTOM EXCEPTION FOR READING MOVIE AND CITY NAME// 
        super(s);                                                    //
    }                                                                
}
class InvalidMovieException extends Exception{
    InvalidMovieException(String s){                               //SUPER KEYWORD USED
        super(s);
    }
}