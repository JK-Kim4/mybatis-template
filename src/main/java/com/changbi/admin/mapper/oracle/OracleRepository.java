package com.changbi.admin.mapper.oracle;

import java.util.HashMap;

public interface OracleRepository {

    HashMap<String, Object> getBookDetail(String bookName);

}
