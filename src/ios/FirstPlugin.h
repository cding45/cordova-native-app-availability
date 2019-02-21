#import <Cordova/CDVPlugin.h>

@interface FirstPlugin : CDVPlugin {
}

- (void)echo:(CDVInvokedUrlCommand *)command;

@end