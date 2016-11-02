	// create the module and name it scotchApp
	var scotchApp = angular.module('scotchApp', ['ngRoute']);

	// configure our routes
	scotchApp.config(function($routeProvider) {
		$routeProvider

			// route for the home page
			.when('/', {
				templateUrl : 'home.html',
				controller  : 'mainController'
			})

			// route for the about page
			.when('/login', {
				templateUrl : 'login.html',
				controller  : 'loginController'
			})

			// route for the contact page
			.when('/contact', {
				templateUrl : 'contact.html',
				controller  : 'contactController'
			});
	});

	// create the controller and inject Angular's $scope
	scotchApp.controller('mainController', function($scope) {
		// create a message to display in our view
		$scope.message = 'Everyone come and see how good I look!';
	});

	scotchApp.controller('loginController', function($scope) {
		$scope.message = 'Look! I am an Login page.';
	});

	scotchApp.controller('contactController', function($scope) {
		$scope.message = 'Contact us! JK. This is just a demo.';
	});