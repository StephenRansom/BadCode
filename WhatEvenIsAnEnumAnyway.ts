//details have been changed to protect the ~~innocent~~ guilty, but this was found in the wild stashed between other messes.
//It was in a function that was much too long with a distinct lack of documentation, leaving you to guess at what the poorly named
//and completely mistyped function parameters actually did.

function getSomeSortedValues(sortOrder: number, booleanA: number, enumValue: string, anotherPoorlyNamedParameter: any ): String[]{
    let sort = sortOrder > 0 ? "ASC" : "DESC";
    let sqlQuery = "SELECT * FROM TableName ORDER BY ID " + sort;
    return doTheQuery(sqlQuery);
}