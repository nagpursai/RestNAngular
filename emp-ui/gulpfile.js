/**
 * Gulp file for build the project
 */

var gulp = require("gulp"),
	uglify = require('gulp-uglify'),
	sass = require('gulp-ruby-sass'),
	inject = require('gulp-inject');

function errorLog(error){
	console.error.bind(error);
	this.emit('end');
}
//Script task
//Uglifes
gulp.task('scripts',function(){
	gulp.src('*.js')
		.pipe(uglify())
		.on('error', errorLog)
		.pipe(gulp.dest('build'));
});

//Html task
//Uglifes
gulp.task('htmls',function(){
	gulp.src('*.html')
		.pipe(uglify())
		.on('error', errorLog)
		.pipe(gulp.dest('build'));
});

//Html task
//Uglifes
gulp.task('apps',function(){
	gulp.src('app')
		.pipe(uglify())
		.on('error', errorLog)
		.pipe(gulp.dest('build'));
});
//Styles task
//
gulp.task('styles-build',function(){
	return sass('app/scss/*.scss', {
	style: 'compressed' })
		.on('error', errorLog)
		.pipe(gulp.dest('assets/css/'));
});


//Watch task
//Watches the file 
gulp.task('watch',function(){
	gulp.watch('*.js',['scripts']);
	gulp.watch('app/scss/*.scss',['styles-build']);
});

gulp.task('default',['scripts','htmls','apps','styles-build','watch']);

