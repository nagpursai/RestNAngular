/**
 * http://usejsdoc.org/
 */
angular.module('myApp').controller(
		'EmployeeController',
		[
				'$scope',
				'EmployeeService',
				'NgTableParams',
				'$state',
				 function($scope, EmployeeService, NgTableParams, $state) {
				
					var self = this;
					$scope.data = []; 
					$scope.employeeService = new EmployeeService();

					
					/**
					 * @ngdoc
					 * @name getEmployeeDetails
					 * To get the ticket details
					 */
					$scope.employeeService.getEmployeeDetails(function(
							ticketData) {
						$scope.data = ticketData;
						var data = $scope.data;
						console.log($scope.data);
						$scope.employeeList = new NgTableParams({count:$scope.data.length}, {filterDelay: 0,data});
					});
			
					$scope.$on('$viewContentLoaded', function() {
					   console.log("init");
					  
					});
			
					/**
					 * @ngdoc
					 * @name
					 * 
					 */
					$scope.logout = function() {
						console.log("Logout");
						$state.go('login');	

					};
								
				} ]);
