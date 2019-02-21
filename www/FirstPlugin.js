var exec = require('cordova/exec');
var PLUGIN_NAME = "FirstPlugin";

var FirstPlugin = {
	echo: function(phrase, cb) {
		exec(cb, null, PLUGIN_NAME, 'echo', [phrase]);
	}
}

module.exports = FirstPlugin