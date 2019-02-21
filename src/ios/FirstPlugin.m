#import "FirstPlugin.h"
#import <Cordova/CDVAvailability.h>

@implementation FirstPlugin

- (void)pluginInitialize {
}

- (void)echo:(CDVInvokedUrlCommand *)command {
	NSString* phrase = [command.arguments objectAtIndex:0];
	NSLog(@"%@", phrase);
}