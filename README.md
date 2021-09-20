# magic-spring

## Database Setup

Magic Spring uses MTG JSON (https://mtgjson.com/) to get game data.

The SQL script to generate the tables and data can be found at https://mtgjson.com/downloads/all-files/
To set up database"

```sh
mysql
CREATE DATABASE <DATABASE_NAME>;
USE <DATABASE_NAME>;
source <path_to_sql_file>/AllPrintings.sql
```
