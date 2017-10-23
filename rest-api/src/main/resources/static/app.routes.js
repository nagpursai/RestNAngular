/**
 * http://usejsdoc.org/
 */


angular.module('myApp').config(['$stateProvider', '$urlRouterProvider', '$locationProvider',function($stateProvider, $urlRouterProvider, $locationProvider){
		console.log('In config');
		$locationProvider.html5Mode({
			   enabled: true,
			   requireBase: false			
		});
		
		$urlRouterProvider.otherwise("dashboard");
		$stateProvider
		.state('dashboard', {
			url:'/dashboard',
			templateUrl: 'app/emp/views/emp-form.html',
			controller: 'EmployeeController'
		});
	
		
	}]);