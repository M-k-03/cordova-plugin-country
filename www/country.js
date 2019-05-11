var Country = function() {};

/*var CountryError = function(code, message) {
  this.code = code || null;
  this.message = message || '';
};*/

Country.prototype.get = function(success, fail) {
  cordova.exec(success, fail, 'Country', 'get', []);
};

Country.prototype.upgradeFirmware = function(success, fail, args) {
  cordova.exec(success, fail, 'Country', 'upgradeFirmware', [args]);
};

if (!window.plugins) {
  window.plugins = {};
}
if (!window.plugins.country) {
  window.plugins.country = new Country();
}

if (module.exports) {
  module.exports = Country;
}
