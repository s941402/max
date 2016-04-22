// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
// TembooSession session = new TembooSession("accountName", "myFirstApp", "abc123xxxxxxxxxxxxxx");

GetIntradayTimeSeries getIntradayTimeSeriesChoreo = new GetIntradayTimeSeries(session);

// Get an InputSet object for the choreo
GetIntradayTimeSeriesInputSet getIntradayTimeSeriesInputs = getIntradayTimeSeriesChoreo.newInputSet();

// Set credential to use for execution
getIntradayTimeSeriesInputs.setCredential("activity20GET");

// Set inputs

// Execute Choreo
GetIntradayTimeSeriesResultSet getIntradayTimeSeriesResults = getIntradayTimeSeriesChoreo.execute(getIntradayTimeSeriesInputs);