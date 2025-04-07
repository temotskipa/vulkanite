#!/bin/bash

# Update Iris imports from net.coderbot.iris to net.irisshaders.iris
find . -name "*.java" -type f -exec sed -i 's/net\.coderbot\.iris/net\.irisshaders\.iris/g' {} \;

# Update Iris target paths in Mixin redirects
find . -name "*.java" -type f -exec sed -i 's/Lnet\/coderbot\/iris/Lnet\/irisshaders\/iris/g' {} \;

echo "Iris imports updated successfully!"