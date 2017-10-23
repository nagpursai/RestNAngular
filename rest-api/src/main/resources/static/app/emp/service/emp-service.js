/**
 * http://usejsdoc.org/
 */
angular.module('myApp').factory('EmployeeService',
		['$q', 'Restangular','$timeout','configService', function($q, Restangular, $timeout,configService) {
	
	function EmployeeService(){
		
	}

	EmployeeService.prototype = {
			getEmployeeDetails : function(callback) {
				Restangular.setBaseUrl("http://localhost:8888/restapi/emps");
				$timeout(function() {
					Restangular.all('details').getList().then(function(employees){
						callback(employees);
					});
				},1000);
			},
		
		
	};
	return EmployeeService;
}]);