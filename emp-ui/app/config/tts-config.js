/**
 * This use for configuration file to read the properties file for url and etc.
 * This is the factory services work as singleton
 */
angular.module('myApp').factory('configService', function($http) {
    return {
        getValue: function(key) {
        	console.log("In Config Factory");
            return $http.get('../resources/urls.properties');
        }
    }
});